package org.aerogear.mobile.security;

/**
 * Listener for events about check execution.
 */
public interface SecurityCheckExecutorListener {

    /**
     * Called after each check is executed
     * 
     * @param result the result of the check
     */
    void onExecuted(SecurityCheckResult result);

    /**
     * Called when all submitted checks has been executed.
     */
    void onComplete();
}
