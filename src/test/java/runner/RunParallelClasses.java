package runner;

import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

public class RunParallelClasses {

	@Test
	public void test() {
		Class[] cls = {JunitRun.class, JunitRun2.class};
		JUnitCore.runClasses(ParallelComputer.classes(), cls);
	}
	
}
