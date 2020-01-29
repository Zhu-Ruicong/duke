package com.duke.task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Deadline extends Task {

    protected LocalDate by;

    public Deadline(String description, String by) throws DateTimeParseException {
        super(description);
        this.by = Task.generateTime(by);
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + ")";
    }

    @Override
    public String generateWriteFormat() {
        int k = this.isDone ? 1 : 0;
        return "D|"+ k + "|" + description + "|" + by;
    }
}