import org.springframework.context.ApplicationEvent;

public class CourseFullEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never {@code null})
     */
    public CourseFullEvent(Object source) {
        super(source);
    }


}
