package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakeCamelUtilTest {

	@Test
	public void スネークからキャメルに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDefGhi";

		String actual = scu.snakeToCamelcase("abc_def_ghi");

		assertThat(actual, is(expected));

		}
	
	public void キャメルからスネークに変換できる() {

		SnakeCamelUtil scu = new SnakeCamelUtil();

		String expected = "abc_def_ghi";

		String actual = scu.snakeToCamelcase("AbcDefGhi");

		assertThat(actual, is(expected));

		}

		public void 先頭の文字を大文字に変換できる() {

		SnakeCamelUtil scu = new SnakeCamelUtil();

		String expected = "Abc";

		String actual = scu.snakeToCamelcase("abc");

		assertThat(actual, is(expected));

		}

		 

		public void 先頭の文字を小文字に変換できる() {

		SnakeCamelUtil scu = new SnakeCamelUtil();

		String expected = "abc";

		String actual = scu.snakeToCamelcase("Abc");

		assertThat(actual, is(expected));

		}

}
