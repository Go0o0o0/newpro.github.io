package moe.fuqiuluo.remote.action.handlers

import moe.fuqiuluo.remote.action.ActionSession
import moe.fuqiuluo.remote.action.IActionHandler
import moe.fuqiuluo.xposed.helper.NTServiceFetcher

internal object GetForwardMsg: IActionHandler() {
    override suspend fun internalHandle(session: ActionSession): String {
        val id = session.getString("id")

        val kernelService = NTServiceFetcher.kernelService
        val sessionService = kernelService.wrapperSession
        val msgService = sessionService.msgService

        return error("不支持实现，请提交ISSUE！", session.echo)
    }

    override val requiredParams: Array<String> = arrayOf("id")

    override fun path(): String  = "get_forward_msg"
}