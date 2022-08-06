package com.bbk.satellitereceiverremotecontrol;

public class ButtonCodes {

    static int[] onOff = {9122, 4502, 534, 602, 582, 554, 582, 554,
            582, 554, 582, 550, 586, 550, 586, 550,
            582, 554, 582, 1658, 582, 1658, 582, 1662,
            582, 1658, 582, 1662, 578, 1662, 606, 1634,
            606, 1634, 582, 554, 582, 554, 578, 1662,
            582, 1658, 582, 1658, 582, 554, 582, 550,
            582, 554, 582, 1658, 582, 1658, 582, 554,
            582, 554, 582, 554, 582, 1658, 582, 1658,
            582, 1658, 582, 1000};

    static int[] up = {9130, 4478, 586, 554, 610, 526, 586, 550,
            610, 530, 582, 554, 610, 526, 586, 550,
            610, 530, 582, 1658, 586, 1658, 586, 1658,
            610, 1634, 610, 1634, 610, 1634, 582, 1662,
            582, 1658, 610, 530, 582, 1662, 582, 554,
            610, 1634, 610, 1634, 610, 526, 586, 554,
            606, 530, 582, 1662, 606, 530, 582, 1662,
            582, 554, 610, 526, 586, 1658, 586, 1658,
            610, 1634, 610, 1000};

    static int[] down = {9114, 4506, 586, 554, 610, 526, 586, 554,
            610, 526, 586, 550, 586, 554, 582, 554,
            610, 530, 582, 1662, 582, 1662, 582, 1662,
            582, 1662, 582, 1662, 582, 1662, 586, 1658,
            586, 1658, 586, 550, 610, 530, 582, 554,
            586, 1658, 586, 554, 582, 554, 610, 1634,
            586, 554, 582, 1662, 582, 1662, 586, 1658,
            586, 550, 586, 1658, 586, 1662, 582, 554,
            610, 1634, 586, 1000};

    static int[] right = {9142, 4502, 538, 602, 586, 554, 586, 554,
            586, 554, 586, 554, 586, 554, 586, 554,
            586, 554, 586, 1658, 586, 1662, 586, 1658,
            586, 1658, 586, 1662, 586, 1658, 586, 1662,
            610, 1634, 610, 1634, 614, 1634, 586, 1658,
            586, 554, 586, 554, 610, 530, 586, 554,
            586, 550, 590, 550, 586, 554, 614, 526,
            586, 1658, 586, 1662, 586, 1658, 586, 1658,
            586, 1658, 614, 1000};

    static int[] left = {9182, 4506, 562, 578, 586, 554, 614, 526,
            590, 550, 590, 554, 610, 530, 586, 554,
            586, 554, 614, 1634, 614, 1630, 614, 1634,
            590, 1658, 614, 1634, 610, 1634, 590, 1658,
            590, 1658, 586, 1662, 586, 1658, 590, 1658,
            586, 554, 614, 526, 614, 526, 590, 1658,
            586, 554, 614, 526, 614, 526, 590, 550,
            614, 1634, 614, 1634, 614, 1630, 614, 526,
            590, 1658, 586, 1000};

    static int[] ok = {9146, 4502, 614, 526, 586, 554, 586, 554,
            586, 554, 586, 554, 586, 550, 590, 550,
            586, 554, 614, 1634, 586, 1658, 586, 1662,
            586, 1658, 586, 1662, 586, 1658, 586, 1658,
            586, 1662, 586, 554, 586, 1658, 586, 1662,
            586, 554, 586, 550, 590, 554, 582, 554,
            586, 554, 586, 1658, 590, 550, 586, 554,
            586, 1658, 590, 1658, 586, 1658, 586, 1662,
            586, 1658, 586, 1000};

    static int[] zero = {9142, 4478, 586, 554, 582, 554, 610, 530,
            582, 554, 610, 530, 582, 554, 610, 530,
            610, 526, 586, 1658, 610, 1634, 610, 1634,
            610, 1634, 610, 1634, 586, 1658, 610, 1634,
            610, 1634, 614, 526, 586, 550, 610, 1634,
            610, 1634, 610, 530, 582, 554, 610, 530,
            582, 554, 610, 1634, 610, 1634, 586, 550,
            610, 530, 610, 1634, 586, 1658, 582, 1662,
            610, 1634, 610, 1000};

    static int[] one = {9130, 4478, 610, 526, 610, 526, 610, 530,
            582, 554, 610, 526, 582, 554, 610, 530,
            582, 554, 610, 1630, 610, 1634, 610, 1634,
            582, 1662, 606, 1634, 610, 1634, 610, 1634,
            610, 1634, 582, 554, 610, 530, 582, 1658,
            610, 530, 610, 1630, 610, 530, 610, 1634,
            610, 526, 610, 1634, 606, 1638, 610, 526,
            610, 1634, 586, 550, 610, 1634, 610, 530,
            582, 1662, 606, 1000};

    static int[] two = {9186, 4474, 614, 530, 606, 530, 610, 530,
            610, 530, 610, 526, 614, 526, 586, 554,
            610, 526, 610, 1638, 582, 1662, 586, 1658,
            610, 1634, 614, 1634, 610, 1634, 614, 1630,
            614, 1634, 610, 530, 606, 1638, 610, 1634,
            610, 530, 610, 1634, 610, 530, 610, 530,
            610, 530, 582, 1662, 610, 526, 614, 526,
            586, 1658, 610, 530, 610, 1634, 614, 1630,
            614, 1634, 610, 1000};

    static int[] three = {9074, 4498, 586, 550, 582, 554, 582, 554,
            582, 550, 610, 526, 582, 554, 582, 550,
            582, 554, 582, 1658, 582, 1658, 582, 1662,
            582, 1658, 582, 1658, 582, 1658, 582, 1658,
            610, 1634, 582, 1658, 582, 554, 582, 1658,
            582, 550, 582, 1662, 582, 550, 582, 554,
            582, 554, 578, 554, 582, 1658, 582, 554,
            582, 1658, 582, 554, 582, 1658, 582, 1658,
            582, 1658, 582, 1000};

    static int[] four = {9098, 4502, 530, 606, 582, 554, 582, 550,
            582, 554, 582, 554, 578, 554, 582, 554,
            582, 550, 582, 1662, 578, 1662, 582, 1658,
            582, 1658, 582, 1658, 606, 1634, 610, 1630,
            582, 1662, 578, 554, 582, 554, 582, 550,
            582, 554, 582, 1658, 582, 554, 582, 1658,
            582, 554, 578, 1662, 606, 1634, 582, 1658,
            582, 1658, 582, 554, 578, 1662, 582, 550,
            582, 1662, 578, 1000};

    static int[] five = {9070, 4502, 554, 582, 582, 554, 606, 526,
            582, 554, 606, 530, 582, 550, 582, 554,
            610, 526, 578, 1662, 582, 1658, 602, 1638,
            582, 1658, 582, 1658, 582, 1662, 606, 1634,
            582, 1658, 582, 554, 582, 1658, 582, 554,
            606, 526, 582, 1658, 610, 526, 582, 554,
            606, 526, 582, 1662, 578, 554, 582, 1658,
            582, 1662, 606, 526, 582, 1658, 610, 1634,
            606, 1634, 582, 1000};

    static int[] six = {9182, 4482, 582, 558, 558, 582, 606, 530,
            586, 558, 582, 558, 610, 530, 554, 586,
            582, 558, 610, 1634, 614, 1634, 638, 1610,
            614, 1634, 610, 1634, 586, 1662, 582, 1666,
            582, 1662, 558, 1690, 558, 582, 610, 530,
            586, 558, 578, 1666, 582, 554, 614, 526,
            558, 586, 606, 530, 586, 1662, 582, 1662,
            558, 1690, 558, 582, 582, 1662, 610, 1634,
            614, 1634, 610, 1000};

    static int[] seven = {9126, 4510, 554, 582, 614, 526, 582, 558,
            582, 554, 586, 554, 558, 582, 610, 530,
            582, 554, 610, 1634, 586, 1662, 610, 1634,
            610, 1634, 586, 1662, 582, 1662, 562, 1686,
            558, 1690, 558, 578, 614, 526, 586, 1662,
            586, 1662, 558, 578, 586, 554, 642, 1606,
            586, 554, 582, 1662, 586, 1662, 586, 554,
            586, 554, 586, 1662, 558, 1690, 582, 554,
            614, 1634, 614, 1000};

    static int[] eight = {9110, 4506, 534, 602, 610, 530, 582, 554,
            586, 550, 586, 554, 582, 554, 582, 554,
            586, 554, 582, 1662, 582, 1658, 586, 1658,
            606, 1638, 586, 1658, 586, 1658, 582, 1662,
            582, 1662, 582, 554, 582, 1662, 582, 1662,
            582, 1662, 582, 554, 582, 554, 586, 550,
            586, 554, 582, 1662, 610, 526, 582, 554,
            586, 554, 582, 1658, 586, 1658, 586, 1658,
            610, 1634, 582, 1000};

    static int[] nine = {9122, 4502, 534, 606, 586, 554, 610, 526,
            586, 554, 582, 554, 586, 554, 582, 554,
            586, 554, 582, 1662, 606, 1634, 586, 1658,
            586, 1658, 586, 1662, 582, 1662, 582, 1658,
            586, 1658, 610, 1634, 586, 554, 582, 1662,
            582, 1662, 610, 526, 586, 554, 582, 554,
            586, 554, 582, 554, 586, 1658, 582, 554,
            586, 554, 582, 1662, 582, 1662, 582, 1662,
            582, 1658, 610, 1000};

    static int[] exit = {9078, 4502, 582, 554, 578, 554, 582, 550,
            582, 554, 582, 550, 582, 554, 578, 554,
            582, 550, 582, 1658, 582, 1658, 582, 1658,
            582, 1658, 582, 1658, 582, 1658, 578, 1662,
            578, 1662, 582, 1658, 578, 1662, 578, 1662,
            578, 554, 582, 1658, 606, 526, 582, 554,
            578, 554, 582, 550, 582, 554, 582, 554,
            578, 1658, 606, 530, 578, 1662, 578, 1662,
            578, 1662, 578, 1000};

    static int[] recall = {9074, 4478, 582, 550, 582, 550, 606, 530,
            578, 554, 606, 526, 606, 530, 578, 554,
            606, 526, 606, 1634, 606, 1634, 578, 1662,
            602, 1634, 610, 1630, 606, 1634, 606, 1634,
            606, 1634, 582, 550, 606, 530, 606, 526,
            582, 550, 610, 1634, 606, 526, 606, 526,
            582, 554, 606, 1634, 582, 1658, 582, 1658,
            606, 1634, 582, 550, 582, 1658, 606, 1634,
            582, 1658, 582, 1000};

    static int[] mute = {9118, 4454, 578, 554, 606, 526, 606, 526,
            582, 554, 606, 526, 606, 526, 582, 550,
            634, 502, 602, 1634, 606, 1634, 582, 1658,
            606, 1634, 634, 1606, 582, 1658, 630, 1610,
            630, 1610, 578, 554, 634, 498, 606, 526,
            582, 1658, 582, 554, 578, 554, 630, 502,
            582, 550, 610, 1634, 578, 1658, 606, 1634,
            610, 526, 606, 1634, 606, 1634, 578, 1658,
            606, 1634, 662, 1000};

    static int[] menu = {9062, 4478, 582, 550, 582, 554, 606, 526,
            606, 526, 606, 530, 606, 526, 602, 530,
            606, 526, 606, 1634, 606, 1634, 606, 1634,
            606, 1630, 606, 1634, 606, 1634, 606, 1634,
            578, 1662, 602, 530, 582, 550, 606, 526,
            582, 1658, 606, 1634, 582, 550, 606, 530,
            602, 530, 606, 1634, 578, 1658, 606, 1634,
            606, 526, 610, 526, 602, 1638, 606, 1630,
            606, 1634, 582, 1000};

    static int[] red = {9058, 4506, 578, 554, 582, 550, 606, 530,
            578, 554, 578, 554, 606, 526, 582, 550,
            582, 550, 606, 1634, 606, 1634, 578, 1662,
            602, 1638, 578, 1658, 582, 1658, 606, 1634,
            606, 1634, 602, 530, 578, 1662, 602, 1634,
            606, 530, 602, 1634, 606, 526, 606, 1634,
            606, 526, 606, 1634, 606, 530, 602, 530,
            578, 1662, 602, 530, 578, 1658, 606, 530,
            578, 1658, 606, 1000};

    static int[] green = {9062, 4502, 554, 578, 606, 530, 578, 554,
            606, 526, 606, 526, 582, 550, 606, 530,
            578, 554, 578, 1662, 602, 1634, 606, 1634,
            582, 1658, 606, 1634, 606, 1630, 582, 1658,
            606, 1634, 606, 1630, 582, 1658, 606, 1634,
            578, 554, 606, 1634, 582, 550, 606, 1634,
            578, 554, 606, 526, 582, 550, 582, 554,
            602, 1634, 582, 550, 606, 1634, 582, 550,
            582, 1658, 582, 1000};

    static int[] yellow = {9066, 4478, 554, 578, 606, 530, 606, 526,
            578, 554, 606, 526, 606, 526, 582, 554,
            606, 526, 602, 1634, 606, 1634, 582, 1658,
            606, 1634, 606, 1634, 578, 1658, 606, 1634,
            582, 1658, 578, 1658, 606, 1634, 582, 1658,
            606, 1630, 610, 1630, 582, 550, 610, 526,
            602, 530, 578, 554, 606, 526, 606, 526,
            582, 554, 606, 526, 578, 1662, 606, 1630,
            582, 1658, 582, 1000};

    static int[] blue = {9090, 4478, 554, 578, 606, 530, 578, 554,
            582, 550, 606, 526, 582, 554, 602, 530,
            606, 526, 582, 1658, 606, 1634, 578, 1662,
            602, 1634, 606, 1634, 582, 1658, 582, 1658,
            606, 1634, 578, 1662, 578, 1662, 602, 530,
            602, 1638, 606, 1634, 578, 554, 606, 1634,
            578, 554, 606, 526, 582, 554, 578, 1662,
            578, 554, 578, 554, 606, 1634, 606, 526,
            606, 1634, 606, 1000};
}
