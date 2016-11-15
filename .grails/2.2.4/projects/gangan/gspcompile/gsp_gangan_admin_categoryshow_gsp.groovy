import com.gangan.event.Category
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_admin_categoryshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/category/show.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("admin")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'category.label', default: 'Category'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',7,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('render','g',11,['template':("/user/userDashboard")],-1)
printHtmlPart(4)
invokeTag('render','g',15,['template':("/admin/category/categoryNavigation")],-1)
printHtmlPart(5)
invokeTag('message','g',16,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
codecOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
if(true && (categoryInstance?.categoryName)) {
printHtmlPart(10)
invokeTag('message','g',24,['code':("category.categoryName.label"),'default':("Category Name")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',28,['bean':(categoryInstance),'field':("categoryName")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (categoryInstance?.dateCreated)) {
printHtmlPart(14)
invokeTag('message','g',35,['code':("category.dateCreated.label"),'default':("Date Created")],-1)
printHtmlPart(15)
invokeTag('formatDate','g',38,['date':(categoryInstance?.dateCreated)],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (categoryInstance?.lastUpdated)) {
printHtmlPart(16)
invokeTag('message','g',46,['code':("category.lastUpdated.label"),'default':("Last Updated")],-1)
printHtmlPart(17)
invokeTag('formatDate','g',49,['date':(categoryInstance?.lastUpdated)],-1)
printHtmlPart(12)
}
printHtmlPart(18)
createTagBody(2, {->
printHtmlPart(19)
invokeTag('hiddenField','g',54,['name':("id"),'value':(categoryInstance?.id)],-1)
printHtmlPart(20)
createTagBody(3, {->
invokeTag('message','g',57,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',57,['class':("edit"),'action':("edit"),'id':(categoryInstance?.id)],3)
printHtmlPart(20)
invokeTag('actionSubmit','g',67,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(21)
})
invokeTag('form','g',67,[:],2)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',67,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
