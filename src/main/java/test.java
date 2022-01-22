import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Project name(项目名称)：动态代理
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/22
 * Time(创建时间)： 13:59
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        Student student = new Student();
        student.eat("饭");
        student.study();

        Student_interface proxy = (Student_interface) Proxy.newProxyInstance(student.getClass().getClassLoader(), new Class[]{Student_interface.class}, new InvocationHandler()
        {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
            {
                if (method.getName().equals("study"))
                {
                    System.out.println("学习java");
                    return null;
                }
                else
                {
                    return method.invoke(student, args);
                }
            }
        });

        proxy.eat("饭");
        proxy.study();
    }
}
