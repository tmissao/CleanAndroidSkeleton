package br.com.missao.cleanarchitecture.mvp

import br.com.missao.cleanarchitecture.pojos.dtos.RedditNewsResponse

/**
 * Application's Main MVP
 */

/**
 * Required View Operations
 */
interface MainMvpRequiredViewOperations {

    /**
     * Receives Reddit News
     * @param news list of [RedditNewsResponse]
     */
    fun onGetInitialNews(news: RedditNewsResponse)

    /**
     * Handles Network Error
     */
    fun onNetworkError()
}

/**
 * Operations provided by Presenter
 */
interface MainMvpPresenterOperations {

    /**
     * Obtains the most relevant Reddit News
     * @param offset Number of first ignored news, the default value is zero
     */
    fun getInitialNews(offset: Int = 0)
}

/**
 * Required Presenter Operations
 */
interface MainMvpRequiredPresenterOperations {

    /**
     * Receives Reddit News
     * @param news list of [RedditNewsResponse]
     */
    fun onGetInitialNews(news: RedditNewsResponse)

    /**
     * Handles Network Error
     */
    fun onNetworkError()
}

/**
 * Operations provided by Model
 */
interface MainMvpModelOperations {

    /**
     * Obtains the most relevant Reddit News
     * @param offset Number of first ignored news
     */
    fun getInitialNews(offset: Int)
}

