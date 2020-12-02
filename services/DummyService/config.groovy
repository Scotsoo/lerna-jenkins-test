def getPipelineConfig(boolean isProd, boolean isUat) {
  def config = [:]
  config['build'] = 'npm'
  return config
}

return this