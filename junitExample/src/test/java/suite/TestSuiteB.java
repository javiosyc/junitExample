package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * A demonstration of a test-suite.
 * 
 */
@RunWith(value = Suite.class)
@SuiteClasses(value = { TestCaseB.class })
public class TestSuiteB {}
