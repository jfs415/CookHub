package com.jfs415.cookhub.core.model.estimate;

import lombok.Getter;

@Getter
public class TimeEstimate {

    private final String valueString;
    private final TimeType timeType;
    private final int timeAmount;

    private TimeEstimate(String valueString, TimeType timeType, int timeAmount) {
        this.valueString = valueString;
        this.timeType = timeType;
        this.timeAmount = timeAmount;
    }

    public static TimeEstimate prepTime(TimeType timeType, int timeAmount) {
        return new TimeEstimate("Prep Time", timeType, timeAmount);
    }

    public static TimeEstimate totalTime(TimeType timeType, int timeAmount) {
        return new TimeEstimate("Total Time", timeType, timeAmount);
    }
}
