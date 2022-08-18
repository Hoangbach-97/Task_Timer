package peterbach1997.example.tasktimer

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class ChooseDaysSettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}