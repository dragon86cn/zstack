package org.zstack.sdk.zwatch.alarm;

import org.zstack.sdk.zwatch.alarm.EventSubscriptionLabelInventory;

public class AddLabelToEventSubscriptionResult {
    public EventSubscriptionLabelInventory inventory;
    public void setInventory(EventSubscriptionLabelInventory inventory) {
        this.inventory = inventory;
    }
    public EventSubscriptionLabelInventory getInventory() {
        return this.inventory;
    }

}
