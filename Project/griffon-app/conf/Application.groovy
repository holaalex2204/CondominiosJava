application {
    title = 'Project'
    startupGroups = ['project']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "project"
    'project' {
        model      = 'project.ProjectModel'
        view       = 'project.ProjectView'
        controller = 'project.ProjectController'
    }

}
