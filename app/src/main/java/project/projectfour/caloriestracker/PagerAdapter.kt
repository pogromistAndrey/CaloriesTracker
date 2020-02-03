package project.projectfour.caloriestracker

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter(fragmentManager:FragmentManager) : FragmentPagerAdapter(fragmentManager,FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        val fragment:Fragment
        when(position) {
            1 -> return FragmentQuestionOne.newInstance()
            2 -> return FragmentQuestionOne.newInstance()
            3 -> return FragmentQuestionOne.newInstance()
            else -> {
                return FragmentQuestionOne.newInstance()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }
}