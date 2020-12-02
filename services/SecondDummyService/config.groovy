def getPipelineConfig() {
  def config = [:]
  config['build'] = 'docker'
  return config
}

return this