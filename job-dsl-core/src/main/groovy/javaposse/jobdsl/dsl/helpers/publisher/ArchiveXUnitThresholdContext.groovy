package javaposse.jobdsl.dsl.helpers.publisher

import javaposse.jobdsl.dsl.Context

class ArchiveXUnitThresholdContext implements Context {
    Integer unstable = null
    Integer unstableNew = null
    Integer failure = null
    Integer failureNew = null

    /**
     * Sets the build to unstable if the number or percentage of test failures or skipped tests exceeds the threshold.
     * Defaults to null.
     */
    void unstable(Integer unstable) {
        this.unstable = unstable
    }

    /**
     * Sets the build to unstable if the number or percentage of new test failures or skipped tests exceeds the
     * threshold. Defaults to null.
     */
    void unstableNew(Integer unstableNew) {
        this.unstableNew = unstableNew
    }

    /**
     * Fails the build if the number or percentage of test failures or skipped tests exceeds the threshold.
     * Defaults to null.
     */
    void failure(Integer failure) {
        this.failure = failure
    }

    /**
     * Fails the build if the number or percentage of test failures or skipped tests exceeds the threshold.
     * Defaults to null.
     */
    void failureNew(Integer failureNew) {
        this.failureNew = failureNew
    }
}
