package demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JunitTests {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	@Disabled
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void test1() {
		assertFalse(false);
	}

	@Test
	@DisplayName("test info")
	public void testInfo() {
		System.out.println("aaaa");
	}
}
