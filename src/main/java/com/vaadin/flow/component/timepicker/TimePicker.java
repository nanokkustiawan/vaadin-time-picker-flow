/*
 * Copyright 2000-2017 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.flow.component.timepicker;

import java.time.LocalTime;

import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasEnabled;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasValidation;
import com.vaadin.flow.component.HasValue;
import com.vaadin.flow.function.SerializableFunction;
import com.vaadin.flow.shared.Registration;

/**
 * Server-side component for the <code>vaadin-time-picker</code> element.
 *
 * @author Vaadin Ltd
 */
public class TimePicker
        extends GeneratedVaadinTimePicker<TimePicker, LocalTime>
        implements HasSize, HasValidation, HasEnabled {

    private static final SerializableFunction<String, LocalTime> PARSER = s -> {
        return s == null || s.isEmpty() ? null : LocalTime.parse(s);
    };

    private static final SerializableFunction<LocalTime, String> FORMATTER = d -> {
        return d == null ? "" : d.toString();
    };

    /**
     * Default constructor.
     */
    public TimePicker() {
        this((LocalTime) null);
    }

    /**
     * Convenience constructor to create a time picker with a pre-selected time.
     * 
     * @param time
     *            the pre-selected time in the picker
     */
    public TimePicker(LocalTime time) {
        super(time, null, String.class, PARSER, FORMATTER);
    }

    /**
     * Convenience constructor to create a time picker with a label.
     * 
     * @param label
     *            the label describing the time picker
     * @see #setLabel(String)
     */
    public TimePicker(String label) {
        this();
        setLabel(label);
    }

    /**
     * Convenience constructor to create a time picker with a pre-selected time
     * and a label.
     * 
     * @param label
     *            the label describing the time picker
     * @param time
     *            the pre-selected time in the picker
     */
    public TimePicker(String label, LocalTime time) {
        this(time);
        setLabel(label);
    }

    /**
     * Convenience constructor to create a time picker with a
     * {@link ValueChangeListener}.
     *
     * @param listener
     *            the listener to receive value change events
     * @see #addValueChangeListener(HasValue.ValueChangeListener)
     */
    public TimePicker(
            ValueChangeListener<ComponentValueChangeEvent<TimePicker, LocalTime>> listener) {
        this();
        addValueChangeListener(listener);
    }

    @Override
    public void setLabel(String label) {
        super.setLabel(label);
    }

    /**
     * Gets the label of the time picker.
     *
     * @return the {@code label} property of the time picker
     */
    public String getLabel() {
        return getLabelString();
    }

    @Override
    public void setErrorMessage(String errorMessage) {
        super.setErrorMessage(errorMessage);
    }

    /**
     * Gets the current error message from the time picker.
     *
     * @return the current error message
     */
    @Override
    public String getErrorMessage() {
        return getErrorMessageString();
    }

    @Override
    public void setInvalid(boolean invalid) {
        super.setInvalid(invalid);
    }

    /**
     * Gets the validity of the time picker output.
     * <p>
     * return true, if the value is invalid.
     *
     * @return the {@code validity} property from the time picker
     */
    @Override
    public boolean isInvalid() {
        return isInvalidBoolean();
    }

    @Override
    public void setPlaceholder(String placeholder) {
        super.setPlaceholder(placeholder);
    }

    /**
     * Gets the placeholder of the time picker.
     * <p>
     * This property is not synchronized automatically from the client side, so
     * the returned value may not be the same as in client side.
     * </p>
     *
     * @return the {@code placeholder} property of the time picker
     */
    public String getPlaceholder() {
        return getPlaceholderString();
    }

    @Override
    public void setRequired(boolean required) {
        super.setRequired(required);
    }

    /**
     * Determines whether the time picker is marked as input required.
     * <p>
     * This property is not synchronized automatically from the client side, so
     * the returned value may not be the same as in client side.
     *
     * @return {@code true} if the input is required, {@code false} otherwise
     */
    public boolean isRequired() {
        return isRequiredBoolean();
    }

    /**
     * Sets the {@code step} property of the time picker. It specifies the
     * intervals for the displayed items in the time picker dropdown.
     * <p>
     * Note: the displayed time format can be affected by changing the
     * {@code step} property. By default, the format is {@code hh:mm}, but if
     * the step is less than 60 seconds, the format will be changed to
     * {@code hh:mm:ss} and it can be in {@code hh:mm:ss.fff} format, when the
     * step is less than 1 second.
     * </p>
     * <p>
     * Unit must be set in seconds, and for correctly configuring intervals in
     * the dropdown, it need to evenly divide a day or an hour.
     * </p>
     * <p>
     * If the step is less than 900 seconds, the dropdown is hidden.
     * </p>
     * 
     * @param step
     *            the step to set, unit seconds
     */
    @Override
    public void setStep(double step) {
        super.setStep(step);
    }

    /**
     * Gets the step of the time picker.
     * 
     * <p>
     * This property is not synchronized automatically from the client side, so
     * the returned value may not be the same as in client side.
     * 
     * @return the {@code step} property from the picker, unit seconds
     */
    public double getStep() {
        return super.getStepDouble();
    }

    @Override
    public Registration addInvalidChangeListener(
            ComponentEventListener<InvalidChangeEvent<TimePicker>> listener) {
        return super.addInvalidChangeListener(listener);
    }
}
