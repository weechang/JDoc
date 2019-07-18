package xyz.weechang.jdoc.spring;

/**
 * Spring 相关的一些常量
 *
 * @author zhangwei
 * date 2019/7/17
 * time 18:16
 */
public class SpringConst {

    /*** Controller 类名 */
    public static final String CONTROLLER_CLASS = "org.springframework.stereotype.Controller";

    /*** web 注解基础路径 */
    private static final String WEB_ANNOTATION = "org.springframework.web.bind.annotation.";

    /*** RestController 类名 */
    public static final String REST_CONTROLLER_CLASS = WEB_ANNOTATION + "RestController";

    /*** RequestMapping 类名 */
    public static final String REQUEST_MAPPING_CLASS = WEB_ANNOTATION + "RequestMapping";

    /*** GetMapping 类名 */
    public static final String GET_MAPPING_CLASS = WEB_ANNOTATION + "GetMapping";

    /*** PostMapping 类名 */
    public static final String POST_MAPPING_CLASS = WEB_ANNOTATION + "PostMapping";

    /*** PutMapping 类名 */
    public static final String PUT_MAPPING_CLASS = WEB_ANNOTATION + "PutMapping";

    /*** PatchMapping 类名 */
    public static final String PATCH_MAPPING_CLASS = WEB_ANNOTATION + "PatchMapping";

    /*** DeleteMapping 类名 */
    public static final String DELETE_MAPPING_CLASS = WEB_ANNOTATION + "DeleteMapping";
}
