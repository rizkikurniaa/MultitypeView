package com.kikulabs.multitypeview.data

import com.kikulabs.multitypeview.R
import com.kikulabs.multitypeview.model.MenuItem

class Menu {
    companion object {
        val menus: List<Any>
            get() = mutableListOf(
                "Promo",
                MenuItem("Coffee", 20000, 0, R.drawable.ic_coffee),
                MenuItem("Pizza", 20000, 0, R.drawable.ic_pizza),
                MenuItem("Soup", 30000, 0, R.drawable.ic_soup),
                "Food",
                MenuItem("Salad 1", 20000, 0, R.drawable.ic_salad),
                MenuItem("Salad 2", 30000, 0, R.drawable.ic_salad),
                MenuItem("Salad 3", 40000, 0, R.drawable.ic_salad),
                MenuItem("Salad 4", 15000, 0, R.drawable.ic_salad),
                MenuItem("Salad 5", 100000, 0, R.drawable.ic_salad),
                MenuItem("Salad 6", 12000, 0, R.drawable.ic_salad),
                "Drink",
                MenuItem("Lemonade 1", 6000, 0, R.drawable.ic_juice),
                MenuItem("Lemonade 2", 7000, 0, R.drawable.ic_juice),
                MenuItem("Lemonade 3", 4000, 0, R.drawable.ic_juice),
                MenuItem("Lemonade 4", 5000, 0, R.drawable.ic_juice),
                MenuItem("Lemonade 5", 7000, 0, R.drawable.ic_juice),
                MenuItem("Lemonade 6", 8000, 0, R.drawable.ic_juice),
                MenuItem("Lemonade 7", 9000, 0, R.drawable.ic_juice)
            )
    }
}