package com.yn.code.util;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Map;

public class FreeMarkUtil {
    private static final String TEMPLATE_PATH = "src/main/java/com/yn/code/template";

    public static void generateFile(Map<String, Object> root, String templateName, String fileDir, String fileName) throws Exception {
        Configuration conf = new Configuration();
        conf.setDefaultEncoding("UTF-8");
        conf.setDirectoryForTemplateLoading(new File(TEMPLATE_PATH));
        Template template = conf.getTemplate(templateName);
        File file = new File(fileDir + fileName);
        if (!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        Writer out = new FileWriter(file);
        template.process(root, out);
        out.flush();
        out.close();
    }

}
