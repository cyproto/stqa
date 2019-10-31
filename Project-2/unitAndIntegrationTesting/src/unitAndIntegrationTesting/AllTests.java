package unitAndIntegrationTesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({numToWordTest.class, wordToNumTest.class})
public class AllTests {

}
