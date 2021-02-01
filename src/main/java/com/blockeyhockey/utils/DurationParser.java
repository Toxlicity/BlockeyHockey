package com.blockeyhockey.utils;

import com.blockeyhockey.utils.debugger.DebugMessage;
import com.blockeyhockey.utils.debugger.Debugger;

import java.time.Duration;
import java.time.Instant;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Parse duration from a string into milliseconds.
 * @author harvanchik
 * @since 01-16-2021
 */
public class DurationParser {

    /**
     * This pattern recognizes the following:
     * l = milliseconds,
     * s = seconds,
     * m = minutes,
     * h = hours
     */
    private static final Pattern durationMatcher = Pattern.compile("([0-9]+)([smhl])");

    /**
     * Parse a string duration into milliseconds.
     * @param period The duration in string form (i.e. 2m50s)
     * @return milliseconds parsed from duration string.
     */
    public static Long parseDuration(String period) {
        if (period == null) return null;
        try {
            return Long.parseLong(period);
        } catch (Exception e) {
            Debugger.debug("Invalid duration format!", DebugMessage.ERROR);
        }
        period = period.toLowerCase(Locale.ENGLISH);
        Matcher matcher = durationMatcher.matcher(period);
        Instant instant = Instant.EPOCH;
        while (matcher.find()) {
            long num = Integer.parseInt(matcher.group(1));
            String typ = matcher.group(2);
            switch (typ) {
                case "l":
                    instant = instant.plusMillis(num);
                    break;
                case "s":
                    instant = instant.plus(Duration.ofSeconds(num));
                    break;
                case "m":
                    instant = instant.plus(Duration.ofMinutes(num));
                    break;
                case "h":
                    instant = instant.plus(Duration.ofHours(num));
            }
        }
        return instant.toEpochMilli();
    }
}