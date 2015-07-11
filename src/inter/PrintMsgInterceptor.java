package inter;

import java.lang.reflect.Field;
import java.util.List;

import base.Customer;
import base.JsonTable;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class PrintMsgInterceptor implements Interceptor {

	public void destroy() {
		System.out.println("CustomInterceptor destroy() is called...");
	}

	public void init() {
		System.out.println("CustomInterceptor init() is called...");
	}

	public String intercept(ActionInvocation invocation) throws Exception {

		System.out.println("..Before calling action....");
		long startTime = System.currentTimeMillis();
		String result = invocation.invoke();

		final Object action = invocation.getAction();
		final Class<? extends Object> class1 = action.getClass();
		String className = class1.getName();
		if ("base.JsonTable".equals(className)) {
			JsonTable jt = (JsonTable) action;

			System.out.println("...");
			final List<Customer> gridModel = jt.getGridModel();
			for (Customer customer : gridModel) {
				
				System.out.println("customer:"+customer);
			}
			System.out.println("...");
			System.out.println("getActionMessages: "+jt.getActionMessages());
		}

		final Result result2 = invocation.getResult();
		final Class<? extends Result> class2 = result2.getClass();
		final Field[] fields = class2.getFields();
		for (Field f : fields) {
			
			System.out.println(f);
		}

		long endTime = System.currentTimeMillis();
		System.out.println("After calling action: " + className
				+ " Time taken: " + (endTime - startTime) + " ms");

		return result;
	}
}