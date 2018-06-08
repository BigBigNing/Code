package com.yn.code.util;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Map;

public class FreeMarkUtil {
    public static void generateFile(Map<String, Object> root, String templateName, String fileDir, String fileName) throws Exception {
        Configuration conf = new Configuration();
        conf.setDirectoryForTemplateLoading(new File(fileDir));
        Template template = conf.getTemplate(templateName);
        Writer out = new FileWriter(new File(fileDir + fileName));
        template.process(root, out);
        out.flush();
        out.close();
    }

}
