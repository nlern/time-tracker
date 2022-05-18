package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    public final void add(final TimeEntry entry) {
        entries.add(entry);
    }

    public final void remove(final TimeEntry entry) {
        entries.remove(entry);
    }

    public final int size() {
        return entries.size();
    }

    public final TimeEntry get(final int index) {
        return entries.get(index);
    }
}


