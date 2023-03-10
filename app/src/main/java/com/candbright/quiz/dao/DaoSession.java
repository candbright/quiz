package com.candbright.quiz.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.candbright.quiz.model.data.Question;
import com.candbright.quiz.model.data.QuestionSubject;

import com.candbright.quiz.dao.QuestionDao;
import com.candbright.quiz.dao.QuestionSubjectDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig questionDaoConfig;
    private final DaoConfig questionSubjectDaoConfig;

    private final QuestionDao questionDao;
    private final QuestionSubjectDao questionSubjectDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        questionDaoConfig = daoConfigMap.get(QuestionDao.class).clone();
        questionDaoConfig.initIdentityScope(type);

        questionSubjectDaoConfig = daoConfigMap.get(QuestionSubjectDao.class).clone();
        questionSubjectDaoConfig.initIdentityScope(type);

        questionDao = new QuestionDao(questionDaoConfig, this);
        questionSubjectDao = new QuestionSubjectDao(questionSubjectDaoConfig, this);

        registerDao(Question.class, questionDao);
        registerDao(QuestionSubject.class, questionSubjectDao);
    }
    
    public void clear() {
        questionDaoConfig.clearIdentityScope();
        questionSubjectDaoConfig.clearIdentityScope();
    }

    public QuestionDao getQuestionDao() {
        return questionDao;
    }

    public QuestionSubjectDao getQuestionSubjectDao() {
        return questionSubjectDao;
    }

}
