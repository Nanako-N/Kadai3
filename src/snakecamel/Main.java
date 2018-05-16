package snakecamel;

public class Main {

	public static void main(String[] args) {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String result = scu.capitalize("");
		result = scu.capitalize("a");
		result = scu.capitalize("xyz");
		
		result = scu.uncapitalize("");
		result = scu.uncapitalize("A");
		result = scu.uncapitalize("Xyz");
		
		result = scu.snakeToCamelcase("abc");
		result = scu.snakeToCamelcase("abc_def");
		result = scu.snakeToCamelcase("abc_def_gh");
		result = scu.snakeToCamelcase("abc__def___gh");
		result = scu.snakeToCamelcase("_abc_def__");
		
		result = scu.camelToSnakecase("Abc");
		result = scu.camelToSnakecase("AbcDef");
		result = scu.camelToSnakecase("AbcDefGh");
		
	}

}
