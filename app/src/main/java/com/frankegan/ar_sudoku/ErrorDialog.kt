package com.frankegan.ar_sudoku

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

/**
 * Shows an error message dialog.
 */
class ErrorDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
            AlertDialog.Builder(requireContext())
                    .setMessage(arguments?.getString(ARG_MESSAGE))
                    .setPositiveButton(android.R.string.ok) { _, _ -> requireActivity().finish() }
                    .create()

    companion object {

        @JvmStatic private val ARG_MESSAGE = "message"

        @JvmStatic fun newInstance(message: String): ErrorDialog = ErrorDialog().apply {
            arguments = Bundle().apply { putString(ARG_MESSAGE, message) }
        }
    }

}