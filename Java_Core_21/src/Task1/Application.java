package Task1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) throws Exception {

		getAnnotation(Human.class);

		File file = new File("HumanAnnotation.txt");

		List<String> annotation = getAnnotation(Human.class);

		for (String string : annotation) {
			System.out.println(string);
		}

		writeToFile(file, annotation);
	}

	public static List<String> getAnnotation(Class<?> customClass) {

		List<String> annotationValue = new ArrayList<String>();

		Field[] fields = customClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			if (field.getAnnotation(MyAnnotation.class) instanceof MyAnnotation);
			System.out.println(field.getName() + " -->");
			System.out.println(field.getAnnotation(MyAnnotation.class));
		}
		return annotationValue;

	}

	public static void writeToFile(File file, List<String> list) throws Exception {
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(list);
		oos.close();
		os.close();
	}
}
