const tape = require('tape')
const index = require('../index')
tape('Some test', t => {
  t.deepEqual({
    dummyModule: 'test',
    secondDummyModule: 'test'
  }, index)
  t.end()
})