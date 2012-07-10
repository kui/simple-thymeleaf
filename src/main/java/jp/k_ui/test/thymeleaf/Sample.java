package jp.k_ui.test.thymeleaf;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

public class Sample {

	public static void main(String[] args) {
		TemplateResolver resolver = new ClassLoaderTemplateResolver();
		resolver.setTemplateMode("HTML5");
		
		TemplateEngine engine = new TemplateEngine();
		engine.setTemplateResolver(resolver);
		
		Context context = new Context();
		context.setVariable("title", "Hello, Thymeleaf");
		
		System.out.println(engine.process("foo.html", context));
		System.out.println(engine.getDialects());
	}

}
