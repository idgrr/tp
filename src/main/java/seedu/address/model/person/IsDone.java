package seedu.address.model.person;

import static java.util.Objects.requireNonNull;

/**
 * Represents whether a Person is called in the address book.
 */
public class IsDone {

    public static final String MESSAGE_CONSTRAINTS = "Done has to either be TRUE or FALSE";
    public final boolean value;

    /**
     * Constructs an {@code IsDone}.
     *
     * @param isDone Indication whether person is called.
     */
    public IsDone(boolean isDone) {
        requireNonNull(isDone);
        value = isDone;
    }

    @Override
    public String toString() {
        if (value) {
            return "True";
        }
        return "False";
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof IsDone // instanceof handles nulls
                && (value == ((IsDone) other).value)); // state check
    }

    @Override
    public int hashCode() {
        if (value) {
            return 1;
        }
        return 0;
    }
}
