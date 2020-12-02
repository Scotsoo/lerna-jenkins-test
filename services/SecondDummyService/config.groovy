def getPipelineConfig(boolean isProd, boolean isUat) {
  def config = [:]
  config['build'] = 'docker'
  return config
}

return this