import com.gangan.user.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_admin_usershow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/user/show.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("admin")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'user.label', default: 'User'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
codecOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("list")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
codecOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (userInstance?.username)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("user.username.label"),'default':("Username")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(userInstance),'field':("username")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.password)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("user.password.label"),'default':("Password")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(userInstance),'field':("password")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.country)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("user.country.label"),'default':("Country")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(userInstance),'field':("country")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.city)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("user.city.label"),'default':("City")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(userInstance),'field':("city")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.token)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("user.token.label"),'default':("Token")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(userInstance),'field':("token")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.imageName)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("user.imageName.label"),'default':("Image Name")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(userInstance),'field':("imageName")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.imageContentType)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("user.imageContentType.label"),'default':("Image Content Type")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(userInstance),'field':("imageContentType")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.gender)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("user.gender.label"),'default':("Gender")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(userInstance),'field':("gender")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.accountExpired)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("user.accountExpired.label"),'default':("Account Expired")],-1)
printHtmlPart(33)
invokeTag('formatBoolean','g',102,['boolean':(userInstance?.accountExpired)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.accountLocked)) {
printHtmlPart(34)
invokeTag('message','g',109,['code':("user.accountLocked.label"),'default':("Account Locked")],-1)
printHtmlPart(35)
invokeTag('formatBoolean','g',111,['boolean':(userInstance?.accountLocked)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.enabled)) {
printHtmlPart(36)
invokeTag('message','g',118,['code':("user.enabled.label"),'default':("Enabled")],-1)
printHtmlPart(37)
invokeTag('formatBoolean','g',120,['boolean':(userInstance?.enabled)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.hasVerifiedEmail)) {
printHtmlPart(38)
invokeTag('message','g',127,['code':("user.hasVerifiedEmail.label"),'default':("Has Verified Email")],-1)
printHtmlPart(39)
invokeTag('formatBoolean','g',129,['boolean':(userInstance?.hasVerifiedEmail)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.name)) {
printHtmlPart(40)
invokeTag('message','g',136,['code':("user.name.label"),'default':("Name")],-1)
printHtmlPart(41)
invokeTag('fieldValue','g',138,['bean':(userInstance),'field':("name")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.passwordExpired)) {
printHtmlPart(42)
invokeTag('message','g',145,['code':("user.passwordExpired.label"),'default':("Password Expired")],-1)
printHtmlPart(43)
invokeTag('formatBoolean','g',147,['boolean':(userInstance?.passwordExpired)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.socialProfileList)) {
printHtmlPart(44)
invokeTag('message','g',154,['code':("user.socialProfileList.label"),'default':("Social Profile List")],-1)
printHtmlPart(45)
for( s in (userInstance.socialProfileList) ) {
printHtmlPart(46)
createTagBody(4, {->
codecOut.print(s?.encodeAsHTML())
})
invokeTag('link','g',157,['controller':("socialProfile"),'action':("show"),'id':(s.id)],4)
printHtmlPart(47)
}
printHtmlPart(48)
}
printHtmlPart(17)
if(true && (userInstance?.userAccounts)) {
printHtmlPart(49)
invokeTag('message','g',165,['code':("user.userAccounts.label"),'default':("User Accounts")],-1)
printHtmlPart(45)
for( u in (userInstance.userAccounts) ) {
printHtmlPart(50)
createTagBody(4, {->
codecOut.print(u?.encodeAsHTML())
})
invokeTag('link','g',168,['controller':("userAccount"),'action':("show"),'id':(u.id)],4)
printHtmlPart(47)
}
printHtmlPart(48)
}
printHtmlPart(51)
createTagBody(2, {->
printHtmlPart(52)
invokeTag('hiddenField','g',177,['name':("id"),'value':(userInstance?.id)],-1)
printHtmlPart(53)
createTagBody(3, {->
invokeTag('message','g',178,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',178,['class':("edit"),'action':("edit"),'id':(userInstance?.id)],3)
printHtmlPart(53)
invokeTag('actionSubmit','g',179,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(54)
})
invokeTag('form','g',181,[:],2)
printHtmlPart(55)
})
invokeTag('captureBody','sitemesh',183,[:],1)
printHtmlPart(56)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
