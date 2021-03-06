package de.agilecoders.wicket.core.markup.html.bootstrap.layout.order;

/**
 * Order columns for extra medium screens.
 *
 * @author Jan Ferko
 */
public enum MediumOrderType implements OrderType {
    ORDER0,
    ORDER1, ORDER2, ORDER3, ORDER4, ORDER5, ORDER6,
    ORDER7, ORDER8, ORDER9, ORDER10, ORDER11, ORDER12,
    FIRST, LAST;

    private final String cssClassName;

    /**
     * Constructor.
     */
    private MediumOrderType() {
        this.cssClassName = name().toLowerCase();
    }

    @Override
    public String cssClassName() {
        return equals(ORDER0)
                ? ""
                : String.format("order-md-%s", cssClassName.replace("order", ""));
    }
}
