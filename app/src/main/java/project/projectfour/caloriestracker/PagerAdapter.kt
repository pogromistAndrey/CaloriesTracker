package project.projectfour.caloriestracker

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter(fragmentManager:FragmentManager) : FragmentPagerAdapter(fragmentManager,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {

        when(position) {
            0 -> return FragmentQuestionOne.newInstance()
            1 -> return FragmentQuestionTwo.newInstance()
            2 -> return FragmentQuestionThree.newInstance()
            else -> {
                return FragmentQuestionOne.newInstance()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }
}