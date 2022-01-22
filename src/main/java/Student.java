/**
 * Project name(项目名称)：动态代理
 * Package(包名): PACKAGE_NAME
 * Class(类名): Student
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/22
 * Time(创建时间)： 13:57
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Student implements Student_interface
{
    public void eat(String name)
    {
        System.out.println("学生吃" + name);
    }

    public void study()
    {
        System.out.println("学习");
    }
}
