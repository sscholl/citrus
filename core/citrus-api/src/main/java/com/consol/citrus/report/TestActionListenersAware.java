package com.consol.citrus.report;

/**
 * @author Christoph Deppisch
 */
public interface TestActionListenersAware {

    /**
     * Sets the test action listeners.
     * @param testActionListeners
     */
    void setTestActionListeners(final TestActionListeners testActionListeners);
}
