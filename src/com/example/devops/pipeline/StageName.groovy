

/**
 * Standardized stage names for pipelines.
 * This maintains consistency for visualization/readability.
 **/
enum StageName {
    PREPARATION("Preparation"),
    BUILD("Build"),
    PUSH_ARTIFACTS("Push Artifacts"),
    SONAR_SCAN("Sonar Scan"),
    NOTIFICATION("Notification"),
    BUILD_DOCKER_IMAGE("Build Docker Image"),
    DEPLOY_ON_DEV("Deploy on Dev")

    private String name

    private StageName(String name) {
        this.name = name
    }

    public String getName() {
        return this.@name
    }

    public static String getPreparation() {
        return PREPARATION.getName()
    }

    public static String getBuild() {
        return BUILD.getName()
    }

    public static String getNotification() {
        return NOTIFICATION.getName()
    }

    public static String getSonarScan() {
        return SONAR_SCAN.getName()
    }

    public static String getBuildDockerImage() {
        return BUILD_DOCKER_IMAGE.getName()
    }

    public static String getDeployOnDev() {
        return DEPLOY_ON_DEV.getName()
    }

    public static String getPushArtifacts() {
        return PUSH_ARTIFACTS.getName()
    }
}