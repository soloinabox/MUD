package com.solo.mud;

import com.solo.mud.entities.items.ItemHandler;

public class Mud {

    public static void main(String[] args) {

        Mud mud = new Mud();
        mud.run();

    }

    private void run() {

        init();

    }

    private void init() {

        ItemHandler.init();

    }

}
