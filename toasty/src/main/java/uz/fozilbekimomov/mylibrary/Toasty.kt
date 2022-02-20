package uz.fozilbekimomov.mylibrary

import android.content.Context
import android.widget.Toast

class Toasty {
    companion object {

        const val LENGTH_LONG = 1
        const val LENGTH_SHORT = 0

        private lateinit var context: Context
        private lateinit var message: String
        private var duration: Int = 0

        private lateinit var toast: Toast

        fun makeText(context: Context, message: String, duration: Int) = apply {
            this.duration = duration
            this.context = context
            this.message = message
            toast = Toast.makeText(context, message, duration)
        }

        fun show() {
            toast.show()
        }
    }
//
}