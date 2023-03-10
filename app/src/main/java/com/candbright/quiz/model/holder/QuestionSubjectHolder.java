package com.candbright.quiz.model.holder;

import android.view.View;

import com.candbright.base.adapter.BaseViewHolder;
import com.candbright.quiz.databinding.ItemQuestionSubjectBinding;
import com.candbright.quiz.model.item.QuestionSubjectItem;
import com.candbright.quiz.util.Utility;

/**
 * <p>created by wyh in 2021/12/11</p>
 */
public class QuestionSubjectHolder extends BaseViewHolder<QuestionSubjectItem, ItemQuestionSubjectBinding> {
    private static final String TAG = QuestionSubjectHolder.class.getSimpleName();

    public QuestionSubjectHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bindViewData(QuestionSubjectItem data) {
        rootBinding.tvSubject.setText(Utility.getString("subject_" + data.getSubject()));
        rootBinding.cardRoot.setOnClickListener(v -> {
            mListener.onItemEvent(data.getSortedIndex(), null);
        });
    }
}
