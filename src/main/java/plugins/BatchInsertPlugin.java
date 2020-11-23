package plugins;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;
import tools.BaseGenTool;
import tools.MethodGeneratorTool;
import tools.SqlMapperGeneratorTool;

import java.util.List;

/**
 * @description:
 * @author: songguang.jiao
 * @time: 2020/10/28 0028 15:56
 */
public class BatchInsertPlugin extends PluginAdapter {
    @Override
    public boolean validate(List<String> list) {
        return true;
    }

    private final static String BATCH_INSERT = "batchInsert";

    private final static String BATCH_DELETE = "batchDelete";

    private final static String PARAMETER_NAME = "recordList";


    /**
     * java代码Mapper生成
     *
     * @param interfaze
     * @param topLevelClass
     * @param introspectedTable
     * @return
     */
    @Override
    public boolean clientGenerated(Interface interfaze,
                                   TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        if (BaseGenTool.isMybatisMode(introspectedTable)) {
            //生成batchInsert 和 batchInsertSelective的java方法
            MethodGeneratorTool.defaultBatchInsertOrUpdateMethodGen(MethodGeneratorTool.INSERT, interfaze, introspectedTable, context);
        }
        return super.clientGenerated(interfaze, topLevelClass,
                introspectedTable);
    }

    /**
     * sqlMapper生成
     *
     * @param document
     * @param introspectedTable
     * @return
     */
    @Override
    public boolean sqlMapDocumentGenerated(Document document,
                                           IntrospectedTable introspectedTable) {
        if (BaseGenTool.isMybatisMode(introspectedTable)) {
            //生成batchInsert 和 batchInsertSelective的java方法
            addSqlMapper(document, introspectedTable);
        }
        return super.sqlMapDocumentGenerated(document, introspectedTable);
    }

    /**
     * batchInsert和batchInsertSelective的SQL生成
     *
     * @param document
     * @param introspectedTable
     */
    private void addSqlMapper(Document document, IntrospectedTable introspectedTable) {
        //table名名字
        String tableName = introspectedTable.getFullyQualifiedTableNameAtRuntime();
        //column信息
        List<IntrospectedColumn> columnList = introspectedTable.getAllColumns();

        XmlElement baseElement = SqlMapperGeneratorTool.baseElementGenerator(SqlMapperGeneratorTool.INSERT,
                BATCH_INSERT,
                FullyQualifiedJavaType.getNewListInstance());

        XmlElement foreachElement = SqlMapperGeneratorTool.baseForeachElementGenerator(PARAMETER_NAME,
                "item",
                "index",
                ",");

        baseElement.addElement(new TextElement(String.format("insert into %s (", tableName)));

        foreachElement.addElement(new TextElement("("));

        for (int i = 0; i < columnList.size(); i++) {
            String columnInfo = "";
            String valueInfo = "";
            IntrospectedColumn introspectedColumn = columnList.get(i);
            if (introspectedColumn.isIdentity()) {
                continue;
            }
            columnInfo = introspectedColumn.getActualColumnName();
            valueInfo = MyBatis3FormattingUtilities.getParameterClause(introspectedColumn, "item.");
            if (i != (columnList.size() - 1)) {
                columnInfo += (",");
                valueInfo += (",");
            }
            baseElement.addElement(new TextElement(columnInfo));
            foreachElement.addElement(new TextElement(valueInfo));

        }
        foreachElement.addElement(new TextElement(")"));

        baseElement.addElement(new TextElement(")"));

        baseElement.addElement(new TextElement("values"));

        baseElement.addElement(foreachElement);

        //3.parent Add
        document.getRootElement().addElement(baseElement);
    }
}
