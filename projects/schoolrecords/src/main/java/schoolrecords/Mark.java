package schoolrecords;

import java.util.Arrays;

public class Mark {

    private MarkType markType;
    private Subject subject;
    private Tutor tutor;
    //Both subject and tutor must be provided!
    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        if (subject == null | tutor == null) {
            throw new NullPointerException("Both subject and tutor must be provided!");
        } else {
            this.markType = markType;
            this.subject = subject;
            this.tutor = tutor;
        }
    }
    public Mark(String markType, Subject subject, Tutor tutor) {
        if (subject == null | tutor == null) {
            throw new NullPointerException("Both subject and tutor must be provided!");
        } else {
            this.markType = getMarkType(markType);
            this.subject = subject;
            this.tutor = tutor;
        }
    }

    public String toString() {
        return String.format("%s(%d)", markType.getDescription(), markType.getValue());
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

    private MarkType getMarkType(String markType) {
        if ("excellent".equals(markType.toLowerCase())) {
            return MarkType.A;
        } else if ("very good".equals(markType.toLowerCase())) {
            return MarkType.B;
        } else if ("improvement needed".equals(markType.toLowerCase())) {
            return MarkType.C;
        } else if ("close fail".equals(markType.toLowerCase())) {
            return MarkType.D;
        } else if ("fail".equals(markType.toLowerCase())) {
            return MarkType.F;
        } else {
            throw new IllegalArgumentException("Provided markType is invalid, no such MarkType description.");
        }
    }
}
