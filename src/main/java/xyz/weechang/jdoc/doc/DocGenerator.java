package xyz.weechang.jdoc.doc;

import xyz.weechang.jdoc.enums.FrameType;
import xyz.weechang.jdoc.spring.SpringDocGenerator;

/**
 * 文档生成
 *
 * @author zhangwei
 * date 2019/7/19
 * time 17:54
 */
public class DocGenerator {

    /**
     * 文档生成
     *
     * @param frameType 框架类型
     * @param basePackage 基础包
     */
    public static void docGenerator(FrameType frameType, String basePackage) {
        switch (frameType) {
            case SPRING:
                SpringDocGenerator.docGenerator(basePackage);
                break;
            case JFINAL:
                // todo
                break;
        }
    }

}
