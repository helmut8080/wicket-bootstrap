(function ($) {
    /**
     * Show error message.
     *
     * @param $element form element
     * @param $messageTarget element for message
     * @param message error message
     */
    $.wb_validation.showError = function ($element, $messageTarget, message) {
        if (this.config.borderColor != null) {
            $element.css('border-color', this.config.borderColor);
        }
        $messageTarget.after('<p class="validation validation-message">' + message + '</p>');
    };

    /**
     * @param $element form element
     * @param $messageTarget message target
     */
    $.wb_validation.hideError = function ($element, $messageTarget) {
        if (this.config.borderColor != null) {
            $element.css('border-color', '');
        }
        $messageTarget.next().remove();
    };
})(jQuery);
