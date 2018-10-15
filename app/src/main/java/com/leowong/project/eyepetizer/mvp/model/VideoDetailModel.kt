package com.leowong.project.eyepetizer.mvp.model

import com.leowong.project.eyepetizer.api.RetrofitManager
import com.leowong.project.eyepetizer.mvp.contract.VideoDetailContract
import com.leowong.project.eyepetizer.mvp.model.entity.HomeBean
import io.reactivex.Observable

class VideoDetailModel : VideoDetailContract.Model {
    override fun loadVideoInfo(itemInfo: HomeBean.Issue.Item) {
    }

    override fun requestRelatedVideo(id: Long): Observable<HomeBean.Issue> {
        return RetrofitManager.service.getRelatedData(id)
    }

    override fun onDestroy() {
    }
}