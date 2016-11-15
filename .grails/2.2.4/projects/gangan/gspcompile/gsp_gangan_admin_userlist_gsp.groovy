import com.gangan.user.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_admin_userlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/user/list.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("admin")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'user.label', default: 'User'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',7,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',12,['template':("/admin/user/adminNavigationUser")],-1)
printHtmlPart(5)
invokeTag('message','g',14,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
codecOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
invokeTag('sortableColumn','g',19,['property':("username"),'title':(message(code: 'user.username.label', default: 'Username'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',21,['property':("password"),'title':(message(code: 'user.password.label', default: 'Password'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',24,['property':("country"),'title':(message(code: 'user.country.label', default: 'Country'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',28,['property':("city"),'title':(message(code: 'user.city.label', default: 'City'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',30,['property':("token"),'title':(message(code: 'user.token.label', default: 'Token'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',32,['property':("imageName"),'title':(message(code: 'user.imageName.label', default: 'Image Name'))],-1)
printHtmlPart(11)
loop:{
int i = 0
for( userInstance in (userInstanceList) ) {
printHtmlPart(12)
codecOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(13)
createTagBody(3, {->
codecOut.print(fieldValue(bean: userInstance, field: "username"))
})
invokeTag('link','g',39,['action':("show"),'id':(userInstance.id)],3)
printHtmlPart(14)
codecOut.print(fieldValue(bean: userInstance, field: "password"))
printHtmlPart(14)
codecOut.print(fieldValue(bean: userInstance, field: "country"))
printHtmlPart(14)
codecOut.print(fieldValue(bean: userInstance, field: "city"))
printHtmlPart(14)
codecOut.print(fieldValue(bean: userInstance, field: "token"))
printHtmlPart(14)
codecOut.print(fieldValue(bean: userInstance, field: "imageName"))
printHtmlPart(15)
i++
}
}
printHtmlPart(16)
invokeTag('paginate','g',52,['total':(userInstanceTotal)],-1)
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',52,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
