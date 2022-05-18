package training.taylor.timetracker.core.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Jason on 6/19/2015.
 */
@Component
@Scope("prototype")
public class TimeEntry {
    private String description;
    private float rate;
    private int time;

    public final String getDescription() {
        return description;
    }

    public final void setDescription(final String value) {
        this.description = value;
    }

    public final float getRate() {
        return rate;
    }

    public final void setRate(final float value) {
        this.rate = value;
    }

    public final int getTime() {
        return time;
    }

    public final void setTime(final int value) {
        this.time = value;
    }

    @Override
    public final String toString() {
        return "TimeEntry{"
                + "description='" + description + '\''
                + ", rate=" + rate
                + ", time=" + time
                + '}';
    }
}

